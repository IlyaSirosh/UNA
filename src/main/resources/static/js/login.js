/**
 * Created by Illya on 6/24/17.
 */

$(function () {
    
    var TOKEN_KEY = "jwtToken";
    var $loginButton = $("#login_button");
    var $backButton = $("#back_button")
    var $logout = $("#logout_button");
    var $login = $("#login_form");
    var $dailyPlanButton = $("#daily_plan_button");
    var $dailyPlanPage = $("");
    var $mainContainer = $("#main_container");
    var $protein = $(".protein");
    var $fat = $(".fat");
    var $carbs = $(".carbs");
    var $calories = $(".calories");
    var $nutritionalSummary = $("#nutritional_summary");
    var $proteinSummary = $("#protein_summary");
    var $proteinSummary = $("#fat_summary");
    var $proteinSummary = $("#carbs_summary_summary");
    var $proteinSummary = $("#calories_summary");
    var $mealTemplate = $("#meal_template");
    var $customDishTemplate = $("#custom_dish_template");
    var $customDishTemplate = $("#template_dish_template");
    var $customDishTemplate = $("#factory_dish_template");
    var $productTemplate = $("#product_template");
    var $dishCategory = $("#dish_category");
    var $productCategory = $("#product_category_category");
    var $directoryName =$("#directory_name")

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

    function doLogOut() {
        $.ajax({
            url: "/auth",
            type: "POST",
            data: JSON.stringify(loginData),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function (data, textStatus, jqXHR) {
                setJwtToken(data.token);
                showLogin()
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert("Incorrect data");
            }
        });
    }


    function getDailyPlan(){
        var date = new Date();
        // var string_date = date.getFullYear()+"-"+date.getMonth()+"-"+date.getDay();

        $.ajax({
            url: "/user/daily/plan/"+date.getTime(),
            type: "GET",
            contentType: "application/json; charset=utf-8",
            headers: createAuthorizationTokenHeader(),
            success:function (data, textStatus, jqXHR) {
                obj = JSON.parse(data)
                populateMeals(obj.meals);
            },
            error:function (jqXHR, textStatus, errorThrown) {

            }


        });

    }

    function populateMeals (meals){
        meals.forEach(function (meal)
        {
            var mealCopy = $mealTemplate.clone();
            mealCopy.find($(".calories")).text("-1");
            mealCopy.find($(".name")).text(meal.name);
            $("#main_container").append(mealCopy);
            mealCopy.show();
        })
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
        $logout.show();
        showDailyPlanPage();
    }

    function showMainPage(){
        $mainPage.show();
    }

    function showDailyPlanPage(){
        $dailyPlanButton.hide();
        $directoryName.text("Daily plan");
        getDailyPlan();
        showNutritionalSummary();
    }

    function showMealPage(){
        $dailyPlanButton.show();
        $directoryName.text("Meal");
        showNutritionalSummary();
    }

    function showDishCategoryPage(){
        $dailyPlanButton.show();
        $directoryName.text("Dish category");
        $backButton.show();
        showNutritionalSummary();
    }

    function showProductCategoryPage(){
        $dailyPlanButton.show();
        $directoryName.text("Product category");
        $backButton.show();
        showNutritionalSummary();
    }

    function showNutritionalSummary(){
        rows = $("#main_container").children()

        var proteinSum = 0
        var fatSum = 0
        var carbsSum = 0
        var calorieSum = 0

        rows.forEach(function (row) {
            proteinSum += Number(row.find($(".protein")).text());
        })
        rows.forEach(function (row) {
            fatSum += Number(row.find($(".fat")).text());
        })
        rows.forEach(function (row) {
            carbsSum += Number(row.find($(".carbs")).text());
        })
        rows.forEach(function (row) {
            calorieSum += Number(row.find($(".calories")).text());
        })

        $nutritionalSummary.find($("#protein_summary")).text(proteinSum);
        $nutritionalSummary.find($("#fat_summary")).text(fatSum);
        $nutritionalSummary.find($("#carbs_summary")).text(carbsSum);
        $nutritionalSummary.find($("#calories_summary")).text(calorieSum);
        $nutritionalSummary.show()
    }

    function showLogin(){
        $logout.hide();
        $backButton.hide();
        $mainContainer.hide();
        $backButton.hide();
        $dailyPlanButton.hide();
        $login.show();
    }

    if(getJwtToken()){
        showAfterLogin();
    }
});