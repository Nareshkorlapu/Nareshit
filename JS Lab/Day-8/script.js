/*Que 1 :
---------
	Write a 'JavaScript' program to store 10 elements in array and print them on a console take the inputs from the user.
*/
// var a=[prompt("Enter the elements")]
// console.log(a);
/*Que 2 :
--------
	Write a 'JavaScript' program to sort the numbers array using selection sort technique without using predefined function.
    */
    var x=[2,2,1,3,44,5,33,2];
let z=x.slice().sort((a,b)=>a-b);
console.log(z)
let y=x.slice().sort((a,b)=>b-a);
console.log(y)
let n=x.length

for(let i=0;i<n;i++)
    {
   for(let j=i+1;j<n;j++)
    {
    if(x[i]>x[j])
    {
        let t=x[i];
        x[i]=x[j];
        x[j]=t;
    }
   }
}
console.log(x)

for(let i=0;i<n;i++)
    {
   for(let j=i+1;j<n;j++)
    {
    if(x[i]<x[j])
    {
        let t=x[i];
        x[i]=x[j];
        x[j]=t;
    }
   }
}
console.log(x)
    