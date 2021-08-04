package de.kluk.fimyfi_webservice.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.inject.Named;
import javax.persistence.*;
import java.io.Serializable;


@Entity(name = "fixture")
public class Fixture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String producer;
    private int power;
    private int powerLight;
    private boolean headMover;
    private int goboWheels;
    private int prisms;
    private double minZoom;
    private double maxZoom;
    // @Named("colorSystem")
    private ColorSystem colorSystem;
    private int dmxModes;
    private int minDmx;
    private int maxDmx;
    private int weight;
    @Column(columnDefinition = "TEXT")
    private String comment;
    private String imageURL;

    /**
     * No args constructor for use in serialization
     *
     */
    public Fixture() {
    }


    public Fixture(int id, String name, String producer, int power, int powerLight, boolean headMover, int goboWheels, int prisms, int minZoom, int maxZoom, ColorSystem colorSystem, int dmxModes, int minDmx, int maxDmx, int weight, String comment, String imageURL) {
        super();
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.power = power;
        this.powerLight = powerLight;
        this.headMover = headMover;
        this.goboWheels = goboWheels;
        this.prisms = prisms;
        this.minZoom = minZoom;
        this.maxZoom = maxZoom;
        this.colorSystem = colorSystem;
        this.dmxModes = dmxModes;
        this.minDmx = minDmx;
        this.maxDmx = maxDmx;
        this.weight = weight;
        this.comment = comment;
        this.imageURL = imageURL;
    }

    public Fixture(String name, String producer, int power, int powerLight, boolean headMover, int goboWheels, int prisms, double minZoom, double maxZoom, ColorSystem colorSystem, int dmxModes, int minDmx, int maxDmx, int weight, String comment, String imageURL) {
        this.name = name;
        this.producer = producer;
        this.power = power;
        this.powerLight = powerLight;
        this.headMover = headMover;
        this.goboWheels = goboWheels;
        this.prisms = prisms;
        this.minZoom = minZoom;
        this.maxZoom = maxZoom;
        this.colorSystem = colorSystem;
        this.dmxModes = dmxModes;
        this.minDmx = minDmx;
        this.maxDmx = maxDmx;
        this.weight = weight;
        this.comment = comment;
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Fixture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", power=" + power +
                ", powerLight=" + powerLight +
                ", headMover=" + headMover +
                ", goboWheels=" + goboWheels +
                ", prisms=" + prisms +
                ", minZoom=" + minZoom +
                ", maxZoom=" + maxZoom +
                ", colorSystem=" + colorSystem +
                ", dmxModes=" + dmxModes +
                ", minDmx=" + minDmx +
                ", maxDmx=" + maxDmx +
                ", weight=" + weight +
                ", comment='" + comment + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPowerLight() {
        return powerLight;
    }

    public void setPowerLight(int powerLight) {
        this.powerLight = powerLight;
    }

    public boolean getHeadMover() {
        return headMover;
    }

    public void setHeadMover(boolean headMover) {
        this.headMover = headMover;
    }

    public int getGoboWheels() {
        return goboWheels;
    }

    public void setGoboWheels(int goboWheels) {
        this.goboWheels = goboWheels;
    }

    public int getPrisms() {
        return prisms;
    }

    public void setPrisms(int prisms) {
        this.prisms = prisms;
    }

    public double getMinZoom() {
        return minZoom;
    }

    public void setMinZoom(double minZoom) {
        this.minZoom = minZoom;
    }

    public double getMaxZoom() {
        return maxZoom;
    }

    public void setMaxZoom(double maxZoom) {
        this.maxZoom = maxZoom;
    }

    public ColorSystem getColorSystem() {
        return colorSystem;
    }

    public void setColorSystem(ColorSystem colorSystem) {
        this.colorSystem = colorSystem;
    }

    public int getDmxModes() {
        return dmxModes;
    }

    public void setDmxModes(int dmxModes) {
        this.dmxModes = dmxModes;
    }

    public int getMinDmx() {
        return minDmx;
    }

    public void setMinDmx(int minDmx) {
        this.minDmx = minDmx;
    }

    public int getMaxDmx() {
        return maxDmx;
    }

    public void setMaxDmx(int maxDmx) {
        this.maxDmx = maxDmx;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

}
