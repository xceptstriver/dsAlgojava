var arr = [ 1, 4, 45, 6, 10, -8];
var target = 16;

if(hasTwosum(arr,target))
  console.log("Array has two elements with given value");
else
  console.log("Array doesn't have two elements with given value");  

function hasTwosum(arr, target){
    arr.sort();
    var i=0; j=arr.length-1;

    while(i<j){
        if(arr[i] + arr[j] < target)
         i++;
        else if(arr[i] + arr[j] > target)
         j--;
        else
         return true
    }

    return false;
}