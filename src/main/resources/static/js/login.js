/**
 * Created by Illya on 6/24/17.
 */

$(function () {

    var TOKEN_KEY = "jwtToken";
    var $loginButton = $("#login_button");
    var $login = $("#login_form");
    var $logout = $("logout_button");
    var $mainPage = $("");
    var $dailyPlanButton = $("daily_plan_button");
    var $dailyPlanPage = $("");
    var $mainContainer = $("main_container");


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
                showAfterLogin()
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert("Incorrect data");
            }
        });
    }



    function getDailyPlan(){
        var date = new Date();
        var string_date = date.getYear()+"-"+date.getMonth()+"-"+date.getDay();

        $.ajax({
            url: "/user/daily/plan/"+string_date,
            type: "GET",
            contentType: "application/json; charset=utf-8",
            headers: createAuthorizationTokenHeader(),
            success:function (data, textStatus, jqXHR) {

            },
            error:function (jqXHR, textStatus, errorThrown) {

            }


        });

    }


    function postDailyPlan(dailyPlan){

        $.ajax({
            url: "/user/daily/plan",
            type: "POST",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: JSON.stringify(dailyPlan),
            headers: createAuthorizationTokenHeader(),
            success:function (data, textStatus, jqXHR) {

            }
        });

    }

    function getDishCategories(){

        $.ajax({
            url: "/food/dish/category/all",
            type: "GET",
            contentType: "application/json; charset=utf-8",
            headers: createAuthorizationTokenHeader(),
            success:function (data, textStatus, jqXHR) {

            },
            error:function (jqXHR, textStatus, errorThrown) {

            }


        });

    }


    function getProductMainCategories(){

        $.ajax({
            url: "/food/product/category/main",
            type: "GET",
            contentType: "application/json; charset=utf-8",
            headers: createAuthorizationTokenHeader(),
            success:function (data, textStatus, jqXHR) {

            },
            error:function (jqXHR, textStatus, errorThrown) {

            }


        });

    }


    function getProductCategoriesByParent(category_id){

        $.ajax({
            url: "/food/product/category/of/parent/"+category_id,
            type: "GET",
            contentType: "application/json; charset=utf-8",
            headers: createAuthorizationTokenHeader(),
            success:function (data, textStatus, jqXHR) {

            },
            error:function (jqXHR, textStatus, errorThrown) {

            }


        });

    }

    function getProductByCategory(category_id){

        $.ajax({
            url: "/food/product/of/"+category_id+"/category/all",
            type: "GET",
            contentType: "application/json; charset=utf-8",
            headers: createAuthorizationTokenHeader(),
            success:function (data, textStatus, jqXHR) {

            },
            error:function (jqXHR, textStatus, errorThrown) {

            }


        });

    }


    function getDishesByCategory(category_id){

        $.ajax({
            url: "food/dish/of/"+category_id+"/category/all",
            type: "GET",
            contentType: "application/json; charset=utf-8",
            headers: createAuthorizationTokenHeader(),
            success:function (data, textStatus, jqXHR) {

            },
            error:function (jqXHR, textStatus, errorThrown) {

            }


        });

    }


    function getFactoryDishesByTemplateDish(dish_id){

        $.ajax({
            url: "food/factory/dish/of/"+dish_id+"/template/dish/all",
            type: "GET",
            contentType: "application/json; charset=utf-8",
            headers: createAuthorizationTokenHeader(),
            success:function (data, textStatus, jqXHR) {

            },
            error:function (jqXHR, textStatus, errorThrown) {

            }


        });

    }

    function getMeasureTypes(){

        $.ajax({
            url: "/measure/type/all",
            type: "GET",
            contentType: "application/json; charset=utf-8",
            headers: createAuthorizationTokenHeader(),
            success:function (data, textStatus, jqXHR) {

            },
            error:function (jqXHR, textStatus, errorThrown) {

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


    $loginButton.click(function (event) {
        event.preventDefault();

        var $form = $(this);
        var formData = {
            username: $form.find("#username_field").val(),
            password: $form.find('#password_field').val()
        };

        doLogin(formData);
    });






    function showAfterLogin() {
        $login.hide();

    }

    function showMainPage(){
        $mainPage.show();
    }

    function showDailyPlanPage(){
        $logout.show();

    }



    if(getJwtToken()){
        showAfterLogin();
    }
});