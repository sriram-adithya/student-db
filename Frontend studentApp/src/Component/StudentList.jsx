import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { listStudent } from '../Service/StudentService';

const StudentList = () => {
    const [student, setStudent] = useState([])

    useEffect(() =>{
        try {
          listStudent().then((res) =>{
            setStudent(res.data);
          }) 
        } catch (error) {
            console.log(error)
        }

    },[])
  

  return (
    <div className=" w-full p-4 flex justify-center items-center flex-col bg-slate-700 h-screen">
      <h3 className="text-2xl font-bold mb-4 text-center">List of Students</h3>
      <table className="bg-white border border-gray-300">
        <thead className="bg-gray-200">
          <tr>
            <th className="py-2 px-4 border-b border-gray-300">Student Id</th>
            <th className="py-2 px-4 border-b border-gray-300">First Name</th>
            <th className="py-2 px-4 border-b border-gray-300">Last Name</th>
            <th className="py-2 px-4 border-b border-gray-300">Email</th>
          </tr>
        </thead>
        <tbody>
          {
            student.map(detail =>
              <tr key={student.id} className="hover:bg-gray-600">
              <td className="py-2 px-4 border-b border-gray-300">{detail.id}</td>
              <td className="py-2 px-4 border-b border-gray-300">{detail.firstName}</td>
              <td className="py-2 px-4 border-b border-gray-300">{detail.lastName}</td>
              <td className="py-2 px-4 border-b border-gray-300">{detail.email}</td>
            </tr>
            )
          }
        </tbody>
      </table>
    </div>
  );
}

export default StudentList;
