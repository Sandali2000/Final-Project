import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomePageComponent} from "./HomePage/home-page/home-page.component";
import {CustomerLoginComponent} from "./Customer/customer-login/customer-login.component";
import {ProductComponent} from "./ProductPage/product/product.component";
import {EmployeeLoginComponent} from "./Employee/employee-login/employee-login.component";
import {AdminLoginComponent} from "./Admin/admin-login/admin-login.component";
import {AdminDashboardComponent} from "./Admin/admin-dashboard/admin-dashboard.component";
import {ProductDetailsComponent} from "./ProductDetails/product-details/product-details.component";
import {ChackOutPageComponent} from "./chack-out-page/chack-out-page.component";
import {AuthGuard} from "./auth/guards/auth.guard";
import {EmployeeListComponent} from "./Admin/employee-list/employee-list.component";
import {CustomerListComponent} from "./Admin/customer-list/customer-list.component";
import {ItemListComponent} from "./Admin/item-list/item-list.component";

const routes: Routes = [
  {path:'',component:HomePageComponent},
  {path:'customerLogin',component:CustomerLoginComponent},
  {path:'product',component:ProductComponent},
  {path:'employeeLogin',component:EmployeeLoginComponent},
  {path:'adminLogin',component:AdminLoginComponent},
  {path:'adminDashboard',component:AdminDashboardComponent},
  {path:'check',component:ChackOutPageComponent, canActivate:[AuthGuard]},
  {path:'productDetail/:id',component:ProductDetailsComponent},
  {path:'EmployeeList',component:EmployeeListComponent},
  {path:'CustomerList',component:CustomerListComponent},
  {path:'ItemList',component:ItemListComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
