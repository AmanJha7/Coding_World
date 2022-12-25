console.log("Starting at tut6");
let html="<h1>Tut6 is this</h1>"+"<p>this is the paragraph</p>";
console.log(html);
html = html.concat(" another interesting inforMation !! "," and many other information");
console.log(html.toLowerCase());
console.log(html.toUpperCase());
console.log(html[14]);
console.log(html.lastIndexOf("h1"));
console.log(html.charAt(14));
console.log(html.endsWith("on"));
console.log(html.includes("on"));
console.log(html.substring(0,23));
console.log(html.slice(0,23));

console.log(html.substring(-5));
console.log(html.slice(-5));


console.log(html.split(' '));


console.log(html.replace('this','here'));

let fruit1='orange';
let fruit2='apple';

let myHtml=`Hello ${name}
    <h1>This is a fruit that is available at store  wahh!! "heading" ... </h1>
    <p>you can have more information about ${fruit1} and 
    ${fruit2}</p>
`;
console.log(myHtml);

document.body.innerHTML=myHtml;
