let products = [
    {id: 1, price: 200, name: 'hung', img: "https://i.pinimg.com/736x/48/5f/b6/485fb6b2aafbbfae7b2131a1f9f5688f.jpg"},
    {id: 2, price: 300, name: 'hanh', img: "https://www.elle.vn/wp-content/uploads/2017/07/25/hinh-anh-dep-1.jpg"},
    {id: 3, price: 400, name: 'khanh', img: "https://d1hjkbq40fs2x4.cloudfront.net/2016-01-31/files/1045-2.jpg"}
];

show();

function show() {
    let str = "";
    for (const product of products) {
        str +=`<tr>
                    <td>${product.id}</td>
                    <td>${product.price}</td>
                    <td>${product.name}</td>
                    <td><img src="${product.img}" width="300" height="250" alt=""></td>
                    <td><button type="button" class="btn btn-warning" onclick="showEdit(${product.id})" data-toggle="modal" data-target="#modalEdit">Edit</button></td>
                    <td><button type="button" class="btn btn-danger" onclick="deleteProduct(${product.id})">Delete</button></td>
               </tr>`
    }
    document.getElementById("show").innerHTML = str;
}


function showEdit(idP) {
    let index = findIndexById(idP);
    document.getElementById("idE").value = products[index].id;
    document.getElementById("nameE").value = products[index].name;
    document.getElementById("priceE").value = products[index].price;
    document.getElementById("imgE").value = products[index].img;
}

function editProduct() {
    let id = document.getElementById("idE").value;
    let name = document.getElementById("nameE").value;
    let price = document.getElementById("priceE").value;
    let img = document.getElementById("imgE").value;
    let product = {id, name, price, img};
    let index = findIndexById(id);
    products[index] = product;
    show();
}

function deleteProduct(idP) {
    let index = findIndexById(idP);
    products.slice(index, 1);
    show();
}

function findIndexById(idP) {
    for (let i = 0; i < products.length; i++) {
        if (products[i].id == idP) return i;
    }
    return -1;
}

function createProduct() {
    let id = document.getElementById("id").value;
    let name = document.getElementById("name").value;
    let price = document.getElementById("price").value;
    let img = document.getElementById("img").value;
    let product = {id, name, price, img}
    products.push(product);
    show();
}



