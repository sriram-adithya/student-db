import axios from "axios";

const URL = "http://localhost:8080/api/students";

export const listStudent = () =>{
   return axios.get(URL);
}