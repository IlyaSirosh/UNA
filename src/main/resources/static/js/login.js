/**
 * Created by Illya on 6/24/17.
 */

$(function () {
    
    var TOKEN_KEY = "jwtToken";
    var $loginButton = $("#login_button");
    var $backButton = $("#back_button");
    var $logout = $("#logout_button");
    var $login = $("#login_form");
    var $dailyPlanButton = $("#daily_plan_button");
    var $mainContainer = $("#main_container");
    var $nutritionalSummary = $("#nutritional_summary");
    var $proteinSummary = $("#protein_summary");
    var $fatSummary = $("#fat_summary");
    var $carbsSummary = $("#carbs_summary_summary");
    var $caloriesSummary = $("#calories_summary");
    var $mealTemplate = $("#meal_template");
    var $customDishTemplate = $("#custom_dish_template");
    var $templateDishTemplate = $("#template_dish_template");
    var $factoryDishTemplate = $("#factory_dish_template");
    var $productTemplate = $("#product_template");
    var $dishCategory = $("#dish_category");
    var $productCategory = $("#product_category_category");
    var $directoryName =$("#directory_name");

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

        $.ajax({
            url: "/user/daily/plan/current",
            type: "GET",
            contentType: "application/json; charset=utf-8",
            headers: createAuthorizationTokenHeader(),
            success:function (data, textStatus, jqXHR) {
                populateMeals(data.meals);
            },
            error:function (jqXHR, textStatus, errorThrown) {

            }


        });

    }

    function populateMeals (meals){
        meals.forEach(function (meal)
        {
            var mealCopy = $mealTemplate.clone();
            mealCopy.find($(".fat")).text("-1");
            mealCopy.find($(".name")).text(meal.name);
            $("#main_container").append(mealCopy);
            mealCopy.show();
        })
    }

    function populateCustomDishes (dishes){
        dishes.forEach(function (dish)
        {
            var dishCopy = $customDishTemplate.clone();
            dishCopy.find($(".calories")).text("-1");
            dishCopy.find($(".name")).text(meal.name);
            $("#main_container").append(dishCopy);
            mealCopy.show();
        })
    }
    function populateFactoryDishes (dishes){
        dishes.forEach(function (dish)
        {
            var dishCopy = $factoryDishTemplate.clone();
            dishCopy.find($(".calories")).text("-1");
            dishCopy.find($(".name")).text(meal.name);
            $("#main_container").append(dishCopy);
            mealCopy.show();
        })
    }
    function populateTemplateDishes (dishes){
        dishes.forEach(function (dish)
        {
            var dishCopy = $templateDishTemplate.clone();
            dishCopy.find($(".calories")).text("-1");
            dishCopy.find($(".name")).text(meal.name);
            $("#main_container").append(dishCopy);
            mealCopy.show();
        })
    }

    function populateProducts (meals){
        meals.forEach(function (meal)
        {
            var mealCopy = $mealTemplate.clone();
            mealCopy.find($(".calories")).text("-1");
            mealCopy.find($(".name")).text(meal.name);
            $("#main_container").append(mealCopy);
            mealCopy.show();
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
                populateProducts(data);
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
                populateDishes(data);
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


        var formData = {
            username: $login.find("#username_field").val(),
            password: $login.find('#password_field').val()
        };

        console.log(formData.username + " " + formData.password)

        doLogin(formData);
    });

    function showAfterLogin() {
        $login.hide();
        $logout.show();
        $mainContainer.show();
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
        $nutritionalSummary.hide();
        getDishCategories();
        showNutritionalSummary();
    }

    function showProductCategoryPage(){
        $dailyPlanButton.show();
        $directoryName.text("Product category");
        $backButton.show();
        $nutritionalSummary.hide();
        getProductMainCategories();
        showNutritionalSummary();
    }

    function showNutritionalSummary(){
        rows = $("#main_container").children();

        var proteinSum = 0;
        var fatSum = 0;
        var carbsSum = 0;
        var calorieSum = 0;

        rows.forEach(function (row) {
            proteinSum += Number(row.find($(".protein")).text());
        });
        rows.forEach(function (row) {
            fatSum += Number(row.find($(".fat")).text());
        });
        rows.forEach(function (row) {
            carbsSum += Number(row.find($(".carbs")).text());
        });
        rows.forEach(function (row) {
            calorieSum += Number(row.find($(".calories")).text());
        });

        $proteinSummary.text(proteinSum);
        $fatSummary.text(fatSum);
        $carbsSummary.text(carbsSum);
        $caloriesSummary.text(calorieSum);
        $nutritionalSummary.show();
    }

    function showLogin(){
        $logout.hide();
        $backButton.hide();
        $mainContainer.hide();
        $backButton.hide();
        $dailyPlanButton.hide();
        $nutritionalSummary.hide();
        $directoryName.hide();
        $login.show();
    }



    $logout.click(function (event) {
        event.preventDefault();

        removeJwtToken();
        showLogin();

    });


    if(getJwtToken()){
        showAfterLogin();
        console.log("Token in storage");
    }else{
        showLogin();
        console.log("Token is not in storage. Try login");
    }
});