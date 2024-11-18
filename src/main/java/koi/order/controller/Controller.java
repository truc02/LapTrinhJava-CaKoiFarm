package koi.order.controller;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "home", value = "/home")
public class Controller extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void destroy() {
    }
}
