package ro.mirodone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

// using base URI with relatives URIs
       // try {
            // URI uri = new URI("db://username:password@myserver.com:5000/catalog/phones?os=android#samsung");
            // URI uri = new URI("http://username:password@myserver.com:5000/catalog/phones?os=android#samsung");

/*            URI baseUri = new URI("http://username:password@myserver.com:5000");
            URI uri1 = new URI("/catalog/phones?os=android#samsung");
            URI uri2 = new URI("/catalog/tvs?manufacturer=samsung");
            URI uri3 = new URI("/stores/locations?zip=12345");

            URI resolvedUri1 = baseUri.resolve(uri1);
            URI resolvedUri2 = baseUri.resolve(uri2);
            URI resolvedUri3 = baseUri.resolve(uri3);

            URL url1 = resolvedUri1.toURL();
            System.out.println("Url = " + url1);
            URL url2 = resolvedUri2.toURL();
            System.out.println("Url = " + url2);
            URL url3 = resolvedUri3.toURL();
            System.out.println("Url = " + url3);*/

            //read webpage with URL
            try {
                URL url = new URL("http://example.org");



                BufferedReader inputStream = new BufferedReader(
                        new InputStreamReader(url.openStream()));
                String line = "";
                while (line != null){
                    line = inputStream.readLine();
                    System.out.println(line);
                }
                inputStream.close();

            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            }
        }
    }
