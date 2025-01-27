// Que 2 : Write a 'JavaScript' program to Separate Strings and Numbers and print array.
    

// 	Sample Input: 
//       		["apple", 5, "banana", 10, 15, "grape"]
             

// 	Sample Output:
// 		String array : ["apple", "banana", "grape"]
// 		Numbers array : [5, 10, 15]

let mixedArray = ["apple", 5, "banana", 10, 15, "grape"]
let str = []
let num = []
mixedArray.forEach((data) => {    
    if (typeof data === 'string')
    {
        str.push(data)
    } else  if(typeof data === 'number') 
    {
        num.push(data)
    }
})
console.log("Original  array is : ", mixedArray);
console.log("String array : ", str);
console.log("Numbers array : ", num);