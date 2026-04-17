package d5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class s {
    private int bagFreeSpace = 5;
    private Map<String, Object> itemsInStock = new HashMap();
    private int lockerSpace = 10;
    private ArrayList<Integer> museumBackgroundAvailable = new ArrayList<>(Arrays.asList(new Integer[]{0, 1, 2, 3}));
    private int museumBackgroundIdSelected = 0;
    private int museumSpace = 0;
    private int stallSpace = 4;
    private int stockFreeSpace = 2000;
    private int stockSpace = 2000;
    private Map<String, Long> timeBuyPackages = new HashMap();

    public int getBagFreeSpace() {
        return this.bagFreeSpace;
    }

    public Map<String, Object> getItemsInStock() {
        return this.itemsInStock;
    }

    public int getLockerSpace() {
        return this.lockerSpace;
    }

    public ArrayList<Integer> getMuseumBackgroundAvailable() {
        return this.museumBackgroundAvailable;
    }

    public int getMuseumBackgroundIdSelected() {
        return this.museumBackgroundIdSelected;
    }

    public int getMuseumSpace() {
        return this.museumSpace;
    }

    public int getStallSpace() {
        return this.stallSpace;
    }

    public int getStockFreeSpace() {
        return this.stockFreeSpace;
    }

    public int getStockSpace() {
        return this.stockSpace;
    }

    public Map<String, Long> getTimeBuyPackages() {
        return this.timeBuyPackages;
    }

    public void setBagFreeSpace(int i2) {
        this.bagFreeSpace = i2;
    }

    public void setItemsInStock(Map<String, Object> map) {
        this.itemsInStock = map;
    }

    public void setLockerSpace(int i2) {
        this.lockerSpace = i2;
    }

    public void setMuseumBackgroundAvailable(ArrayList<Integer> arrayList) {
        this.museumBackgroundAvailable = arrayList;
    }

    public void setMuseumBackgroundIdSelected(int i2) {
        this.museumBackgroundIdSelected = i2;
    }

    public void setMuseumSpace(int i2) {
        this.museumSpace = i2;
    }

    public void setStallSpace(int i2) {
        this.stallSpace = i2;
    }

    public void setStockFreeSpace(int i2) {
        this.stockFreeSpace = i2;
    }

    public void setStockSpace(int i2) {
        this.stockSpace = i2;
    }

    public void setTimeBuyPackages(Map<String, Long> map) {
        this.timeBuyPackages = map;
    }
}
