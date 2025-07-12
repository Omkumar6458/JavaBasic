/*let p = document.querySelector("p");
p.addEventListener("click",function() 
{
  console.log("parah was clicked");
}
)

let di = document.querySelector("div");
di.addEventListener("mouseover",function()
{
  console.log('mouse is geo');
}


)
*/

let btn = document.querySelector("button");

btn.addEventListener("click",function()
{
  alert("uojn");

  console.dir(this.innerText);
  this.style.backgroundColor = "blue";
})

let p = document.querySelector("p");
let h1 = document.querySelector("h1");
let h3 = document.querySelector("h3");

p.addEventListener("click", color);
h1.addEventListener("click", color);

h3.addEventListener("click", color);






function color()
{
 this.style.backgroundColor="blue";
}