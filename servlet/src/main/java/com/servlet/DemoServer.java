package com.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class DemoServer extends GenericServlet {

        public void service(ServletRequest request, ServletResponse response)
                throws ServletException, IOException {
            System.out.println("ttest");
        }
    }

