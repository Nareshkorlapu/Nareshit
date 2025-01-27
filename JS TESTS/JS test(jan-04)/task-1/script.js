// Que 1 : Write a 'JavaScript' program to sort the numbers array using selection sort technique.
// -------

// Sample input :	[45, 3, 25, 78, 12]

// Sample Output : 

// 	Array before sorting : [45, 3, 25, 78, 12]
//         Array after sorting  : [3, 12, 25, 45, 78]

var arr = [45, 3, 25, 78, 12]
console.log("Array before sorting : " ,arr);
for (var i = 0; i < arr.length; i++) {
    var min = i;
    for (var j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
            min = j;
        }
    }
    if (i !== min) {
        var temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
console.log("Array after sorting  : " ,arr);
