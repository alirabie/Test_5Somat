package examplewtest.midopc.test5somat.API.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mido PC on 4/20/2016.
 */
public class Shop {

    @SerializedName("Id")
    @Expose
    private Integer Id;
    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("Facebook")
    @Expose
    private String Facebook;
    @SerializedName("Address")
    @Expose
    private String Address;
    @SerializedName("Phone")
    @Expose
    private String Phone;
    @SerializedName("Rate")
    @Expose
    private Integer Rate;
    @SerializedName("Category")
    @Expose
    private Integer Category;
    @SerializedName("Active")
    @Expose
    private Boolean Active;
    @SerializedName("AdvEnd")
    @Expose
    private String AdvEnd;

    /**
     *
     * @return
     * The Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     *
     * @param Id
     * The Id
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     *
     * @return
     * The Name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param Name
     * The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *
     * @return
     * The Facebook
     */
    public String getFacebook() {
        return Facebook;
    }

    /**
     *
     * @param Facebook
     * The Facebook
     */
    public void setFacebook(String Facebook) {
        this.Facebook = Facebook;
    }

    /**
     *
     * @return
     * The Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     *
     * @param Address
     * The Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     *
     * @return
     * The Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     *
     * @param Phone
     * The Phone
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     *
     * @return
     * The Rate
     */
    public Integer getRate() {
        return Rate;
    }

    /**
     *
     * @param Rate
     * The Rate
     */
    public void setRate(Integer Rate) {
        this.Rate = Rate;
    }

    /**
     *
     * @return
     * The Category
     */
    public Integer getCategory() {
        return Category;
    }

    /**
     *
     * @param Category
     * The Category
     */
    public void setCategory(Integer Category) {
        this.Category = Category;
    }

    /**
     *
     * @return
     * The Active
     */
    public Boolean getActive() {
        return Active;
    }

    /**
     *
     * @param Active
     * The Active
     */
    public void setActive(Boolean Active) {
        this.Active = Active;
    }

    /**
     *
     * @return
     * The AdvEnd
     */
    public String getAdvEnd() {
        return AdvEnd;
    }

    /**
     *
     * @param AdvEnd
     * The AdvEnd
     */
    public void setAdvEnd(String AdvEnd) {
        this.AdvEnd = AdvEnd;
    }

}
