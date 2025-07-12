let input = document.querySelector("input");

input.addEventListener("keydown",(e) => {
    console.log("code = ", e.code);
    if (e.code == "keyU") {
      console.log("character moves up");
    }
    if (e.code == "keyD") {
      console.log("character down up");
    }

    if (e.code == "keyE") {
      console.log("character sssxss up");
    }

    if (e.code == "keyF") {
      console.log("character movsszsz up");
    }


  })



  let form = document.querySelector("form");

  form.addEventListener("submit",function(event){

    /*event.preventDefault(); */
    alert("sss");
  });