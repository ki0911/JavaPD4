let data, songs;

function init(){
  $.ajaxSetup({async: false});

  let link = "https://fluffy-giggle-r464rprjpjppcpprv-8500.app.github.dev/tracks";
  let route = "/tracks";

  songs = $.getJSON(link + route).responseJSON;

  console.log(songs);

  for(let i = 0; i < songs.length; i++){
    let song = songs[i];

    console.log(song.Name);
    console.log(song.Composer);
    console.log(song.UnitPrice);
    console.log("--------------------");
  }

  createCards(songs);
}

function createCards(tracks){
  let output = document.getElementById("output");

  for(let i = 0; i < tracks.length; i++){
    let track = tracks[i];

    let card = document.createElement("div");
    card.classList.add("card");

    card.innerHTML = `
  <h3>Song: ${track.Name}</h3>
  <p><strong>Composer:</strong> ${track.Composer || "Unknown"}</p>
  <p><stronssg>Price:</strong> $${track.UnitPrice}</p>
`;

    output.appendChild(card);
  }
}
