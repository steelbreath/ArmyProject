package com.solvd.army.models.equipment;

import java.util.List;

public class Ammunition {
        private Long id;
        private Integer mm;
        private Integer quantity_in_the_package;
        private Integer packages;
        private List<com.solvd.army.models.equipment.Weapon> weapons;

        public Ammunition() {}
        public Ammunition(Long id, Integer mm, Integer quantity_in_the_package, Integer packages) {
            this.id = id;
            this.mm = mm;
            this.quantity_in_the_package = quantity_in_the_package;
            this.packages = packages;
        }

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public Integer getMm() {
            return mm;
        }
        public void setMm(Integer mm) {
            this.mm = mm;
        }
        public Integer getQuantity_in_the_package() {
            return quantity_in_the_package;
        }
        public void setQuantity_in_the_package(Integer quantity_in_the_package) {
            this.quantity_in_the_package = quantity_in_the_package;
        }
        public Integer getPackages() {
            return packages;
        }
        public void setPackages(Integer packages) {
            this.packages = packages;
        }
}
