function submit(){
    const name = document.getElementById('name').value;
    localStorage.setItem('name', name);
    window.open('b.html', '_blank');
}

function next() {
    const name = localStorage.getItem('name');
    window.open('c.html', '_blank');
}

function load() {
    document.getElementById("accepted_name").innerHTML = "Welcome " + localStorage.getItem("name");
}