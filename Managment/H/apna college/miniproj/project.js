let gameSeq = [];
let userSeq =[];

let btns =["yellow","red","purple","green"];

let started =false;
let level =0;
let h2 = document.querySelector("h2");
document.addEventListener("keypress",function()
{
  if(started == false)
  {
    console.log("game is started ");
    started = true;

    levelUp();
    
  } 
});


function gameFlash(btn)
{
  btn.classList.add("flash");
  setTimeout(function()
{
  btn.classList.remove("flash");
}, 400);

}


function userFlash(btn)
{
  btn.classList.add("userflash");
  setTimeout(function()
{
  btn.classList.remove("userflash");
}, 240);

}


function levelUp()
{
   userSeq = [];
  level++;
  h2.innerText = `Level ${level}`;
   
let randIdx = Math.floor(Math.random() * 3);
let randColor = btns[randIdx];
let randBtn = document.querySelector(`.${randColor}`);
gameSeq.push(randColor);
console.log(gameSeq);

 gameFlash(randBtn);

}


function checkAns(idx)
{
  //console.log("curr level : ", level);


  if(userSeq[idx] === gameSeq[idx])
  {
   levelUp();

  }
   else{
    h2.innerText = `Game Over ! Press any Key to start `;
   }
}

function btnPress()
{
  let btn = this;
  userFlash(btn);
  console.log(this);


  userColor = btn.getAttribute("id");
  userSeq.push(userColor);
  console.log(userColor);

  checkAns(userSeq.length-1);
}

let allBtns = document.querySelectorAll(".btn");

for(btn of allBtns)
{
  btn.addEventListener("click",btnPress);
}