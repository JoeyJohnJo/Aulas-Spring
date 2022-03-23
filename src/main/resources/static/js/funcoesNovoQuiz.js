function salvarQuiz() {
    let nomeQuiz = document.getElementById("nomeQuiz").value;

    let xhr = new XMLHttpRequest();
    xhr.open("POST", "/salvar", true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send(JSON.stringify({
        "nome": nomeQuiz
    }));
}
