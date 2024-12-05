// simple functions
// a function to print Helloworld
function display(){
    console.log("Hello world")
}
display()
// write a function to print your name in console and call it
function myname(){
    console.log("Naresh")
}
myname()
// function to add two values and print the result in console
var a=10,b=20;
function add(){
    console.log(a+b);
}
add();//30
/* Similarly implement sub, mul and division operations*/
function sub(){
    console.log(a-b);
}
sub();//-10
function multi(){
    console.log(a*b);
}
multi();//200
function division(){
    console.log(a/b);
}
division();//0.5

function add2(a,b){
    console.log(a+b);
}
add2(5,6);//11
add2(2,3);//5
function add3(a,b){
    return a+b;
}
var k= add3(2,5);
console.log(k) // 7
console.log(add3(2,7));
// write a function which takes a string and find return its number of characters
 function strlen(s){
    return s.length;
 }
 var res=strlen("Javascript");
 console.log(res);
 
 // write a function which takes side a square and returns area of the square
 function area(s){
    return s*s;
 }
 var squarearea= area(10);
 console.log("Area of square "+squarearea);

 //write a function which accepts firstname, middlename, lastname and return full name
 function fullname(f,m,l){
    return f+" "+m+" "+l;
 }
 var fname=fullname("Naresh","kumar","korlapu");
 console.log(fname);
//write a function which accepts firstname, middlename, lastname and return shortname like
/*ex:"world","health","orginization" -- who*/
//===  Using Array format 
function short(fn,mn,ln){
    return fn[0]+mn[0]+ln[0];
}
var shortname=short("World","Health","Organization");
console.log(shortname);
// using toUpperCase() function
function short(fn,mn,ln){
    var word= fn.charAt(0)+mn.charAt(0)+ln.charAt(0);
    return word.toUpperCase();
}
var shortname=short("world","health","Organization");
console.log(shortname);

function generatename(myname){
    var words=myname.split(' ');
    var word = words[0].charAt(0)+words[1].charAt(0)+words[2].charAt(0);
    return word.toUpperCase()
}
var fullName= generatename("world health organization");
console.log(fullName);

//default values
function sum3(a,b=2){ // functions can have default values in parameters
    console.log(a+b)
}
sum3(5,6) //5+6= 11
sum3(5) //5+2= 7

//write a function taxiFare which accepts no_of_km and fare_per_km as arguments and returns total fare. Incase fare_per_km is not passed, default fare is 25rs
function taxiFare(fare_per_km,no_of_km=25){
   console.log(no_of_km+fare_per_km);
}
taxiFare(20,30);
taxiFare(30)
