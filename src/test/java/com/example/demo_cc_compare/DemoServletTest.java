package com.example.demo_cc_compare;


import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.*;

public class DemoServletTest {

    @Test
    void testDemoEndpoint() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);//test

        DemoServlet servlet = new DemoServlet();

        // Simulate a GET request
        when(request.getMethod()).thenReturn("GET");

        servlet.doGet(request, response);

        // Überprüfen Sie, ob der richtige Statuscode und Inhaltstyp gesetzt wurden
        verify(response).setStatus(HttpServletResponse.SC_OK);
        verify(response).setContentType("text/plain");

        // Weitere Überprüfungen können hinzugefügt werden, z.B. überprüfen, ob der richtige Inhalt gesendet wurde.
    }
}
