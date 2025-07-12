let url = "https://cat-fact.herokuapp.com"

async function getFacts()
{
  let res = await fetch(url);
  let data = await res.json();
  console.log(data.fact);
}