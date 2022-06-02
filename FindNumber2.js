//number of elements in an array
const num = 7;

//initialize array
const numbers = [];

//select random number between 0 to 100
const a = Math.floor(Math.random()* 100);

//set random number as first index value of array 
numbers[0]= a; 


// select in random way from first index value to num+1 and put numbers in array
for (let i = 1; i < num; i++) {
   x = Math.floor(Math.random() * (num+1)) + a ; 
   
	// rejecting same value
	if(numbers.indexOf(x) !== -1)  
	{  
		i--;  
	} 
	else{
		numbers[i]  = x;
	}

}   

// print array
console.log(numbers);

// Find max value in the array
const max = Math.max(...numbers);

// Find min value in the array
const min = Math.min(...numbers);


sum = 0 ;
total = 0;

// find sum of numbers from minimum value to maximum value in array
for(let i = min; i <= max; i++){
	sum += i;
}


// find sum of the array values
for(let i = 0; i < num; i++){
	total = total + numbers[i];
}

//print missing number

if((sum - total)> 0){
	console.log('Missed Number : '+(sum - total));
}

// print expected missing number when sum and total are same
else{
	console.log('Missed Number in series if last number : '+(max+1)+ ' or if first number : ' + (min-1));
}

