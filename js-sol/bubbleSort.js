const numbers = [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0];

function bubbleSort(array) 
{
  let temp;
  for(let i = 0; i < array.length; i++)
  {
    for(let j = i + 1; j < array.length; j++)
    {
      if(array[i] > array[j])
      {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
  }

}

bubbleSort(numbers);
console.log(numbers);