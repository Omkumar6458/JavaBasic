let input = document.querySelector('input');
let btn = document.querySelector("button");
let ul = document.querySelector("ul");



btn.addEventListener("click",function()
{
  let item = document.createElement("Li");
  item.innerText = input.value;

  let delbtn  =  document.createElement("button");

delbtn.innerText = "delete";

delbtn.classList.add("delete");

item.appendChild(delbtn);

  ul.appendChild(item);
    input.value =""; // to reset the value 
});

// for delete 

let delbtns = document.querySelectorAll(".delete");

for(delbtn of delbtns)
{
  delbtn.addEventListener("click",function()
{
   let par = this.parentElement;
   par.remove();
});
}