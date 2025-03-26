// Refactored Records.java
package frogger;

import java.util.ArrayList;
import java.util.List;

public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    public boolean addRecord(FroggerID id) {
        for (FroggerID existing : this.records) {
            if (existing.equals(id)) {
                return false;
            }
        }
        this.records.add(id);
        return true;
    }
}
