# Arrays
## Creating an Array
 >int [] intArray= new int[100]; 
 #### or 
 > int[] array; //declare reference to an array
> 
 > array = new int[100];  //creates the array, and sets array to refer to it
 > 
 #### or 
> int array[] = new int[100]; //alternative syntax
> 
### **NB:** <ins>Placing the [] after the int makes it clear that the [] is part of the type, not the name.</ins>

## Accessing array Elements:
> itemAtIndexFive = array[4]; //get contents of fifth element of the array
> array[7] = 66; //insert 66 into the eighth cell(position/index)
> 
> ### **NB:** <ins>In Java, the first element is numbered 0.</ins>
> If you use an index that’s less than 0 or greater than the size of the array less 1,
you’ll get the **Array Index Out of Bounds runtime** error.
> 
## Initialization of an Array

> You can initialize an array of primitive type with values this way
>
> *int [] intArray= {0,1,2,3,4,5,17,45}*
> 
> This method initializes the array with the values in the bracket and also outlines the size of the array.
> The size of the array is equal to the number if values/elements in the curly brackets

