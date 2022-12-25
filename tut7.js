console.log("Starting tut 7");
let marks=[14,15,16,17,89,55,12,1,45,100,54,57,92,104,2,8,7,9,44,18,19,20,21,22,23];
const fruitss=["apple", "banana", "chille", "duwanku", "egg","fish", "goat", "hen", "ikjua", "jamun", "kokayo"];
const mixed=['str',87,54,24,14,92,'oranges'];

const arr=new Array(25,25,55,24,48,'orange');
console.log(arr);
console.log(mixed);
console.log(fruitss);

console.log(mixed.splice(2,3));
console.log(mixed.pop());
mixed.shift();
console.log(mixed);
mixed.unshift('hello');
console.log(mixed);
mixed.push('orange');
console.log(mixed);
mixed.unshift(78,93);
console.log(mixed);

mixed.reverse();
console.log(mixed);
marks.sort();
console.log(marks);

let result=[1,2,3,4,5,6,7,8,9];
marks=marks.concat(result);
console.log(marks);

let value=marks.indexOf(45);
console.log(value);

for(let i=0; i<marks.length; i++){
    console.log(marks[i]);
}
 let ans=marks.filter((mark)=>{
    return mark%2==0;
 });
 console.log(ans);


