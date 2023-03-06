import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomePageComponent} from "./HomePage/home-page/home-page.component";
import {CustomerLoginComponent} from "./Customer/customer-login/customer-login.component";
import {ProductComponent} from "./ProductPage/product/product.component";
import {EmployeeLoginComponent} from "./Employee/employee-login/employee-login.component";
import {AdminLoginComponent} from "./Admin/admin-login/admin-login.component";
import {AdminDashboardComponent} from "./Admin/admin-dashboard/admin-dashboard.component";

const routes: Routes = [
  {path:'',component:HomePageComponent},
  {path:'customerLogin',component:CustomerLoginComponent},
  {path:'product',component:ProductComponent},
  {path:'employeeLogin',component:EmployeeLoginComponent},
  {path:'adminLogin',component:AdminLoginComponent},
  {path:'adminDashboard',component:AdminDashboardComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
