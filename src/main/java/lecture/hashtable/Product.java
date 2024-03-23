package lecture.hashtable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Product {
    private String name;
    private String description;
    private List<String> tags;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getName() {
        return name;
    }

    public Product addTagsOfOtherProduct(Product product) {
        this.tags.addAll(product.getTags());
        return this;
    }


    public static void main(String[] args) {
        Map<String, Product> productMap = new HashMap<>();
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");
        Product defaultProduct = new Product("Chocolate", "At least buy chocolate");

        productMap.put(eBike.getName(), eBike);
        productMap.put(roadBike.getName(), roadBike);
        productMap.put(null, defaultProduct);

        System.out.println(productMap);

        Product nextPurchase = productMap.get("E-Bike");
        System.out.println(nextPurchase);

        System.out.println(productMap.get("car"));
        System.out.println(productMap.get(null));

        System.out.println("++++++++++");
        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println(productMap.values());
    }

    @Override
    public String toString() {
        return this.name + ": " + this.description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}

/*
The complexity to check if a key exists is O(1)
while the complexity to check for an element is O(n), as it's necessary to loop
over all the elements in the map.

We can use any class as the key in our HashMap. However, for the map to work
properly, we need to provide an implementation for equals() and hashcode().
 */
