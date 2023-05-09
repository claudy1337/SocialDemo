package com.autonture.socialdemo

object Constants {
    fun getEmployeeData():ArrayList<EntriesClass> {
        val employeeList=ArrayList<EntriesClass>()
        val emp1=EntriesClass("Chinmaya Mohapatra","chinmaya@gmail.com", "dfsdfsfd")
        employeeList.add(emp1)
        val emp9=EntriesClass("Raj kumar","kumarraj@gmail.com", "fsdfdsfdsfd")
        employeeList.add(emp9)
        val emp10=EntriesClass("Raj kumar","kumarraj@gmail.com", "fsdfdsfdsfd")
        employeeList.add(emp10)
        return  employeeList
    }
}