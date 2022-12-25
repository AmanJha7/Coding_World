//console.log("welcome");
//console.log(document.all);
// single and multiple elements selecter
let element=document.getElementById("heading");
//console.log(element);

element=element.className;
//console.log(element);

element=document.childNodes;
//console.log(element);

element=document.getElementById("divhead");
//console.log(element.childNodes);
//console.log("hello");
//console.log(element.parentNode);

//console.log(element);

//element.style.color="red";

element=document.getElementById("myfirst");

//element.style.color="red";
//element.style.backgroundColor="yellow";
//console.log(element);
//element.innerText='harry and larry are the same thing';
//element.innerHTML='<b>harry and larry are the same thing</b>';


let sel=document.querySelector('#myfirst');
//console.log(sel);

// in selector # for id and . for class
/*
sel=document.querySelector('.child');
console.log(sel);

sel=document.querySelector('div');
console.log(sel);
sel.style.backgroundColor="green";
sel.style.color="yellow";

sel=document.querySelector('h1');
console.log(sel);*/
//sel.style.color="red";
//sel.style.backgroundColor="yellow";


let elens=document.getElementsByClassName('container');
console.log(elens[0].getElementsByClassName('child'));

elens=window.document.getElementsByTagName('div');
console.log(elens);

Array.from(elens).forEach((element)=>{console.log(element);});

for(let i=0; i<elens.length; i++){
    console.log(elens[i]);
}
