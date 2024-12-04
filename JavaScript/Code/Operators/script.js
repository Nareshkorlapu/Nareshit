var a=5, b=2;
console.log("Addition is "+(a+b)); //7
console.log(`Substraction is ${a-b}`); //3
console.log(`Multiplication is ${a*b}`); //10
console.log(`Division is ${a/b}`); //2.5
console.log(`Remainder is ${a%b}`); //1
console.log(`Power value is ${a**b}`); //25
/* increment and decrement operators */
a++,b--;
console.log(a,b);
console.log(a++);


var x=10,y=5;
var z=x++ + --y + ++x + y--;
console.log(z);

/*relational operators*/
var a=10, b=5;
console.log(a>b);
console.log(a<b);
console.log(a>=b);
console.log(a<=b);
var a=2,b='2',c=true,d=1;
console.log(c==b) // true -- it compares value only
console.log(a===b) // false -- it compares value and data types
console.log(undefined == null)
console.log(a!=b)// false -- it compares only values
console.log(a!==b)// true -- it compares value and datatypes

/* Assignment operators */
var a=10;
a+=2; // a=a+2
console.log(a); // 12
a-=2;// a=a-2
console.log(a); // 10
a*=2;// a=a*2
console.log(a);// 20
a/=2;// a=a/2
console.log(a);// 10
a%=2;// a=a%2
console.log(a);// 0
a**=2;// a=a**2
console.log(a);// 0
a=2;
console.log(a);//2

//Logical operators
var a=10,b=20;
console.log((a>8)&&(b<25)); // T && T -- T
console.log((a>8) || (b>25));// T || F -- T
console.log(!(a>8));//!T -- F


//ternary operator
var num=5;
var res=(num%2==0)? "Even" : "Odd";
console.log(res);


//special operators
/*unary + */
console.log(5 + '4',5+ +'4')//54 9
/*unary - */
var x=20;
var y=-x;
console.log(y) // -20

/* typeof */
var a=20;
console.log(typeof(a));// number

//nullish operator(??)
console.log(n) //undefined
var k =n ?? a; //if(n==undefined) k=a; else k=n;
console.log(k);
var n =15;

//optional chaining operator(?.)
var obj={
    name:"Naresh",
    age:24
}
console.log(obj?.address)
