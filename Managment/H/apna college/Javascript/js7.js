h1 = document.querySelector("h1");
/*
function changeColor(color,delay)
{
setTimeout(() =>
{
  h1.style.color = color;
},delay);
}

/*
setTimeout( ()=>
{
  h1.style.color = "red";
},3000);

setTimeout(
()=>{
  h1.style.color ="orange";
},4000);


changeColor("red",1000);
changeColor("orange",3000);
changeColor("pink",5000);
*/

function changeColor(color,delay,nextColorChange) //call back
{
  setTimeout(() =>
{
h1.style.color = color;

if(nextColorChange) nextColorChange();

},delay);

}

changeColor("red",1000, ()=>
{
    changeColor("orange",1000,() =>
  {
    changeColor("green",1000, () =>
  {
    changeColor("pink",1000,() =>
  {
        changeColor("yellow",1000)
  });
  });
  });
});

