package eg.gov.iti.jets.controller;

import eg.gov.iti.jets.model.Image;
import eg.gov.iti.jets.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "products", urlPatterns = "/products")
public class ProductsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product product = new Product();
        product.setProductName("Korsy");
        product.setSellPrice(5600d);
        Image image = new Image();
        image.setImagePath("images/home/img-products/product-7.png");
        product.setPrimaryImage(image);

        Product product2 = new Product();
        product2.setProductName("Korsy");
        product2.setSellPrice(5600d);
        Image image2 = new Image();
        image2.setImagePath("images/home/img-products/product-7.png");
        product2.setPrimaryImage(image);

        Product product3 = new Product();
        product3.setProductName("Korsy");
        product3.setSellPrice(5600d);
        Image image3 = new Image();
        image3.setImagePath("images/home/img-products/product-7.png");
        product3.setPrimaryImage(image);

        Product product4 = new Product();
        product4.setProductName("Korsy");
        product4.setSellPrice(5600d);
        Image image4 = new Image();
        image4.setImagePath("images/home/img-products/product-7.png");
        product4.setPrimaryImage(image);
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        req.setAttribute("products" , productList);
        req.getRequestDispatcher("products/products.jsp").include(req,resp);

    }
}