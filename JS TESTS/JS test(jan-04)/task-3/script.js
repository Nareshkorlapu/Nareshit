// Que 3 : 
// ---------
// (USING WHILE LOOP) Write JavaScript program to check given number is automorphic number or not 

// Automorphic number :
// An automorphic number is a number whose square ends in the
// same digits as the number itself.

// Note : take a textbox for input and button for executing a function onclick of the button one function will be executed that function will find whether the number is automorphic or not.

// For example:
// 5,6,25 are automorphic numbers.
// 5*5=25 // last digit is 5
// 6*6=36 // last digit is 6
// 25*25=625 // last digit is 25

// Sample input  : 7
// Sample output : 7 is not automorphic number.

// Sample input  : 625
// Sample output : 625 is automorphic number.

var n;
function checkAutomorphic(){
    n = document.getElementById('num').value;
    var sq = n*n;
    var temp = n;
    var count = 0;
    while(temp>0){
        count++;
        temp = parseInt(temp/10);
    }
    var last = sq%(Math.pow(10,count));
    if(last == n){
        document.getElementById('result').innerHTML = n+" is automorphic number.";
    }
    else{
        document.getElementById('result').innerHTML = n+" is not automorphic number.";
    }
}

