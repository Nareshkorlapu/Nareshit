var a=36,b=27;
console.log(Math.sqrt(a),Math.cbrt(b))
console.log(Math.abs(-10))
console.log(Math.max(5,6,1,5,7,22))
console.log(Math.min(5,6,1,0,-5,222,5,4))
console.log(Math.floor(4.8))
console.log(Math.ceil(4.2))
console.log(Math.round(4.3))
console.log(Math.pow(2,3),2**3)/*we should give two values only or '**' is also used for power*/
console.log(Math.random())
/*Write Js code to print 4 digit OTP*/
console.log(Math.round(Math.random() * 10000))
/*Write a logic to print one dice for ludo game*/
console.log(Math.ceil(Math.random()*6))
var num=25.3157;
console.log(num.toFixed(2))/*25.32*/
console.log(num.toPrecision('5'))/*21.315*/
var a=13;
console.log(a.toString(2))/*Convert into binary,1101*/
// Coverts any value to number by Number() or 'unary +' //
console.log(5+Number('4'))
console.log(5 + +'4')
console.log(5 - -'4')

//Srings
//There is no difference between single quatation or double quatation//
var name="Prasad"
var n='Prasad'
console.log(typeof name, typeof n)
var quote="The Gandhi said,'Good night'"
var msg= "The time is 6'o clock"
//String can be represented by third ways also
var string=`Apple`
console.log(typeof string)
//backticks are used to take dynamic value
var cost=25,quantity=4;
console.log("I bought "+quantity+"apples. Each cose $"+cost+".So total is"+(cost*quantity))
console.log(`I bought ${quantity} apples.Each cost ${cost}.So total is ${cost*quantity}`)
//This way of writing dynamic strings is called Template literal


/*Write a code to find a+b whole square formula result by inputting a,b values and print result using template literal */
var a=2,b=3;
console.log(a.sqrt())
console.log(Math.sqrt(Math.sqrt(a))+Math.sqrt(Math,sqrt(b))+2*a*b)
console.log(a*a+b*b+2*a*b)