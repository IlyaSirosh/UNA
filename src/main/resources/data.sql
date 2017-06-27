
insert into user (email,enabled,pass_reset_date,nickname,password,birth,sex) VALUES ("user@email.com",true, "2017-06-25 01:01:01", "user", "user","1997-07-01" ,"male");
insert into authority (name) values ("ROLE_USER");
insert into user_to_authority (user_id,authority_id) SELECT u.id, a.id FROM user u, authority a WHERE u.nickname="user" AND a.name="ROLE_USER";




INSERT INTO manufacturer (name) VALUES ("novus");
INSERT INTO manufacturer (name) VALUES ("silpo");

INSERT INTO product_category (name) VALUES ("vegetable");
INSERT INTO product_category (name,parent_id) SELECT "olive",id FROM product_category WHERE name="vegetable";
INSERT INTO product_category (name,parent_id) SELECT "black olive",id FROM product_category WHERE name="olive";
INSERT INTO product_category (name,parent_id) SELECT "tomato",id FROM product_category WHERE name="vegetable";
INSERT INTO product_category (name,parent_id) SELECT "greenery",id FROM product_category WHERE name="vegetable";
INSERT INTO product_category (name,parent_id) SELECT "lattuce",id FROM product_category WHERE name="greenery";
INSERT INTO product_category (name,parent_id) SELECT "pepper",id FROM product_category WHERE name="vegetable";
INSERT INTO product_category (name,parent_id) SELECT "potato",id FROM product_category WHERE name="vegetable";
INSERT INTO product_category (name,parent_id) SELECT "red pepper",id FROM product_category WHERE name="pepper";
INSERT INTO product_category (name,parent_id) SELECT "green pepper",id FROM product_category WHERE name="pepper";
INSERT INTO product_category (name,parent_id) SELECT "cucumber",id FROM product_category WHERE name="vegetable";
INSERT INTO product_category (name,parent_id) SELECT "popato",id FROM product_category WHERE name="vegetable";
INSERT INTO product_category (name,parent_id) SELECT "garlic",id FROM product_category WHERE name="vegetable";
INSERT INTO product_category (name,parent_id) SELECT "onion",id FROM product_category WHERE name="vegetable";
INSERT INTO product_category (name,parent_id) SELECT "red onion",id FROM product_category WHERE name="onion";

INSERT INTO product_category (name) VALUES ("fruit");
INSERT INTO product_category (name,parent_id) SELECT "citrus",id FROM product_category WHERE name="fruit";
INSERT INTO product_category (name,parent_id) SELECT "lemon",id FROM product_category WHERE name="citrus";

INSERT INTO product_category (name) VALUES ("spice");
INSERT INTO product_category (name,parent_id) SELECT "salt",id FROM product_category WHERE name="spice";
INSERT INTO product_category (name,parent_id) SELECT "black pepper",id FROM product_category WHERE name="spice";

INSERT INTO product_category (name) VALUES ("oil");
INSERT INTO product_category (name,parent_id) SELECT "olive oil",id FROM product_category WHERE name="oil";
INSERT INTO product_category (name,parent_id) SELECT "vergetable oil",id FROM product_category WHERE name="oil";

INSERT INTO product_category (name) VALUES ("dairy");
INSERT INTO product_category (name,parent_id) SELECT "butter",id FROM product_category WHERE name="dairy";
INSERT INTO product_category (name,parent_id) SELECT "eggs",id FROM product_category WHERE name="dairy";
INSERT INTO product_category (name,parent_id) SELECT "cheese",id FROM product_category WHERE name="dairy";

INSERT INTO product_category (name) VALUES ("bakery");
INSERT INTO product_category (name,parent_id) SELECT "bread",id FROM product_category WHERE name="bakery";

INSERT INTO product_category (name) VALUES ("porridge");
INSERT INTO product_category (name,parent_id) SELECT "buckwheat",id FROM product_category WHERE name="porridge";

INSERT INTO dish_category (name) VALUES ("salad");
INSERT INTO dish_category (name) VALUES ("garnish");



INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "garlic",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="garlic" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "lemon",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="lemon" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "vegetable oil",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="olive oil" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "parmesan",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="cheese" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "black pepper",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="black pepper" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "country bread",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="bread" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "romain lattuce",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="lattuce" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "black olives",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="black olive" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "red onion",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="lattuce" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "red pepper",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="red pepper" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "green pepper",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="green pepper" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "tomato",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="tomato" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "cucumber",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="cucumber" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "feta",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="cheese" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "olive oil",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="olive oil" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "potato",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="potato" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "butter",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="butter" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "salt",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="salt" AND m.name="novus";

INSERT INTO product (name,carbohydrates,fats,proteins,calories,category_id,manufacturer_id)
  SELECT "eggs",1,1,1,1,d.id,m.id from product_category d,manufacturer m where d.name="eggs" AND m.name="novus";


INSERT INTO template_dish (name,carbohydrates,fats,proteins,calories,category_id)
  SELECT "Classic Caesar salad",3.31,57.87,5.1,542.12, id from dish_category where name="salad";

INSERT INTO template_dish (name,carbohydrates,fats,proteins,calories,category_id)
  SELECT "Greek salad",4.29,9.29,2.14,107.14,id from dish_category where name="salad";

INSERT INTO factory_dish (name,carbohydrates,fats,proteins,calories,manufacturer_id,category_id,parent_id)
  SELECT "Greek salad",4.29,9.29,2.14,107.14,m.id ,
 d.id,t.id from dish_category d,manufacturer m,template_dish t where d.name="salad" AND m.name="novus";

INSERT INTO factory_dish (name,carbohydrates,fats,proteins,calories,manufacturer_id,category_id,parent_id)
  SELECT "Greek salad",4.29,9.29,2.14,107.14,m.id ,
 d.id,t.id from dish_category d,manufacturer m,template_dish t where d.name="salad" AND m.name="silpo";

INSERT INTO template_dish (name,carbohydrates,fats,proteins,calories,category_id)
  SELECT "Mashed potatoes",3.31,57.87,5.1,542.12,id from dish_category where name="garnish";

INSERT INTO custom_dish (name,carbohydrates,fats,proteins,calories,category_id,user_id)
  SELECT "Mashed potatoes",3.31,57.87,5.1,542.12,
 d.id,m.id from dish_category d,user m where d.name="garnish" AND m.nickname ="user";


INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Classic Caesar salad" AND c.name="garlic";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Classic Caesar salad" AND c.name="lemon";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Classic Caesar salad" AND c.name="eggs";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Classic Caesar salad" AND c.name="olive oil";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Classic Caesar salad" AND c.name="vegetable oil";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Classic Caesar salad" AND c.name="parmesan";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Classic Caesar salad" AND c.name="black pepper";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Classic Caesar salad" AND c.name="country bread";


INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Greek salad" AND c.name="romain lattuce";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Greek salad" AND c.name="black olives";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Greek salad" AND c.name="red onion";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Greek salad" AND c.name="green pepper";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Greek salad" AND c.name="tomato";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Greek salad" AND c.name="cucumber";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Greek salad" AND c.name="feta";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Greek salad" AND c.name="olive oil";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Greek salad" AND c.name="lemon";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Greek salad" AND c.name="black pepper";



INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Mashed potatoes" AND c.name="potato";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Mashed potatoes" AND c.name="butter";

INSERT INTO template_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM template_dish d, product c WHERE d.name = "Mashed potatoes" AND c.name="salt";


INSERT INTO custom_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM custom_dish d, product c WHERE d.name = "Mashed potatoes" AND c.name="potato";

INSERT INTO custom_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM custom_dish d, product c WHERE d.name = "Mashed potatoes" AND c.name="salt";

INSERT INTO custom_dish_ingredient (dish_id, amount, category_id, ingredient_id)
  SELECT d.id,5,c.category_id,c.id FROM custom_dish d, product c WHERE d.name = "Mashed potatoes" AND c.name="olive oil";



INSERT INTO meal (name,calories,carbohydrates,fats,proteins,time) VALUES ("lunch",100,100,100,100,"12:30:00");

INSERT INTO meal_to_product (meal_id,amount,product_id) VALUES (1,100,14);
INSERT INTO meal_to_template_dish (meal_id,amount,dish_id) VALUES (1,140,1);
INSERT INTO meal_to_product (meal_id,amount,product_id) VALUES (1,100,12);

INSERT INTO meal (name,calories,carbohydrates,fats,proteins,time) VALUES ("dinner",100,100,100,100,"18:30:00");


INSERT INTO meal_to_factory_dish (meal_id,amount,dish_id) VALUES (2,140,1);
INSERT INTO meal_to_custom_dish (meal_id,amount,dish_id) VALUES (2,100,1);

INSERT INTO custom_daily_plan (date,user_id) VALUES ("2017-06-27",1);

INSERT INTO custom_daily_plan_meals (custom_daily_plan_id,meals_id) VALUES (1,1);
INSERT INTO custom_daily_plan_meals (custom_daily_plan_id,meals_id) VALUES (1,2);