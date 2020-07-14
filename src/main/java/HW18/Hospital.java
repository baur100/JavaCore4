package HW18;

import java.util.List;

public class Hospital {
        private String hospitalName;
        private Address address;
        private List<Doctor> doctors;
        private List<InsuranceCompanies> acceptedInsurances;

        public Hospital(String hospitalName, Address address, List<Doctor> doctors) {
                this.hospitalName = hospitalName;
                this.address = address;
                this.doctors = doctors;
        }

        public String getHospitalName() {
                return hospitalName;
        }

        public void setHospitalName(String hospitalName) {
                this.hospitalName = hospitalName;
        }

        public Address getAddress() {
                return address;
        }

        public void setAddress(Address address) {
                this.address = address;
        }

        public List<Doctor> getDoctors() {
                return doctors;
        }

        public void setDoctors(List<Doctor> doctors) {
                this.doctors = doctors;
        }

        public void hospitalInfo(){
                System.out.println("Hospital Name : " +  hospitalName);
                }
        }


