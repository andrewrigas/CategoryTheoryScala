//Category Theory

// Symbols Meaning
// o => After or And Then
// a(->) => function a that takes an input and produce output

//Composition Law
// By composing two functions together the output should be still the same
//A  f(->) B g(->) C
//A g(->) o f(->)  C

//Identity Law
//Identity function should return the input itself
// A idA(->) A f(->) B idb(->) B
// A f(->) o idA(->)  = f = B idB(->) o f(->)

//Associativity Law
//The order of the functions doesn't matter
// A f(->) B g(->) C h(->) D
// A g(->) o f(->) C h(->) D
// A f(->) B h(->) o g(->) D
//A (h(->) o g(->)) o f(->) C = A h(->) o (g(->) o f(->)) C