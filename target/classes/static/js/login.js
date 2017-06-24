/**
 * Created by Illya on 6/24/17.
 */

$(function () {

    var TOKEN_KEY = "jwtToken";
    var $login = $("#loginForm");
    var $userInfo = $("#userInfo").hide();


    function getJwtToken() {
        return localStorage.getItem(TOKEN_KEY);
    }

    function setJwtToken(token) {
        localStorage.setItem(TOKEN_KEY, token);
    }

    function removeJwtToken() {
        localStorage.removeItem(TOKEN_KEY);
    }

    function doLogin(loginData) {
        $.ajax({
            url: "/auth",
            type: "POST",
            data: JSON.stringify(loginData),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function (data, textStatus, jqXHR) {
                setJwtToken(data.token);
                $login.hide();
                showUserInformation();
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert("Cannot login");
            }
        });
    }

    function createAuthorizationTokenHeader() {
        var token = getJwtToken();
        if (token) {
            return {"X-Auth-Token": token};
        } else {
            return {};
        }
    }


    function showUserInformation() {
        $.ajax({
            url: "/user",
            type: "GET",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            headers: createAuthorizationTokenHeader(),
            success: function (data, textStatus, jqXHR) {

                $userInfo.find("#email").text(data.email);
                $userInfo.find("#nickname").text(data.nickname);
                $userInfo.find("#sex").text(data.sex);
                $userInfo.find("#birth").text(data.birth);

                $userInfo.show();
            }
        });
    }

    $("#loginForm").submit(function (event) {
        event.preventDefault();

        var $form = $(this);
        var formData = {
            username: $form.find("#username").val(),
            password: $form.find('#password').val()
        };

        doLogin(formData);
    });

});