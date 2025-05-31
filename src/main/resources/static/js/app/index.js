function substituteOnClick(text) {
    console.log('Clicked with value:', text);
    alert('You clicked with value: ' + text);
    $('#thonclick').replaceWith('<h5 id="thonclick" style="color: green"> Tag was substituted on ' + text + '</h5>')
}