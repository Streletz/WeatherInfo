package streletzcoder.weatherinfo.dataengine.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Country {
    @PrimaryKey
    @NonNull
    public int _id;
    @NonNull
    public String Country;
}
