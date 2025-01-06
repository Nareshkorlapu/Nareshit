// Que 4 :
// =======

// Write a JavaScript program to print all Nth digit prime numbers :
	
// 	Description :
// 		if user enter 2 as a input the program should print all 2 digit prime numbers.

// 	Sample Input : 
// 		Enter a Number : 1 
// 	Sample Output : All 1 digits prime numbers are : 2 3 5 7

// 	Sample Input :
// 		Enter a Number : 2
// 	Sample Output : All 2 digits prime numbers are : 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

var n = (prompt("Enter a Number : "));
function isPrime(num) {
    for (var i = 2; i < num; i++)
        if (num % i === 0) {
        return false;
        }
    return num !== 1;
}
function getPrimes(n) {
    var primes = [];
    for (var i = Math.pow(10, n - 1); i < Math.pow(10, n); i++)
        if (isPrime(i)) {
            primes.push(i);
        }
    return primes;
}
console.log("All "+ n + " digits prime numbers are:");
console.log(getPrimes(n));