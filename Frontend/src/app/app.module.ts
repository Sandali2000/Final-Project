import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './employee/login/login.component';
import { HomeComponent } from './home-page/home/home.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { SearchbarComponent } from './home-page/searchbar/searchbar.component';
import { SearchComponent } from './home-page/search/search.component';
import { MainBodyComponent } from './home-page/main-body.component';
import { MainBannerComponent } from './home-page/main-banner/main-banner.component';
import {CarouselsModule} from "./carousel/carousels.module";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatIconModule} from "@angular/material/icon";
import { FeatursComponent } from './home-page/featurs/featurs.component';
import { AdvertisementComponent } from './home-page/advertisement/advertisement.component';
import { RecentProductComponent } from './home-page/recent-product/recent-product.component';
import { CarouselModule } from 'ngx-owl-carousel-o';
import { NewsletterComponent } from './home-page/newsletter/newsletter.component';
import { FeaturedProductComponent } from './home-page/featured-product/featured-product.component';
import { FeedbackComponent } from './home-page/feedback/feedback.component';
import { FooterComponent } from './footer/footer.component';
import { ProductComponent } from './product-page/product/product.component';
import { ProductPageComponent } from './product-page/product-page.component';
import { BreadcrumbComponent } from './product-page/breadcrumb/breadcrumb.component';
import { ProductListComponent } from './product-page/product-list/product-list.component';
import { SidebarComponent } from './product-page/sidebar/sidebar.component';
import { EmployeeHomeComponent } from './employee/employee-home/employee-home.component';
import { EmployeeComponent } from './employee/employee.component';
import {MatSidenavModule} from "@angular/material/sidenav";
import { EmployeeNavbarComponent } from './employee/employee-navbar/employee-navbar.component';
import {MatListModule} from "@angular/material/list";
import { EmployeeHeaderComponent } from './employee/employee-header/employee-header.component';
import {MatMenuModule} from "@angular/material/menu";
import {MatToolbarModule} from "@angular/material/toolbar";
import { AgreementFormComponent } from './employee/agreement-form/agreement-form.component';
import { AdminComponent } from './admin/admin.component';
import { AdminLoginComponent } from './admin/admin-login/admin-login.component';
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatDialogModule} from '@angular/material/dialog';
import { DialogComponent } from './customer/dialog/dialog.component';
import { CustomerComponent } from './customer/customer.component';
import { DialogLoginComponent } from './customer/dialog-login/dialog-login.component';
import { ContactUsComponent } from './home-page/contact-us/contact-us.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    NavBarComponent,
    SearchbarComponent,
    SearchComponent,
    MainBodyComponent,
    MainBannerComponent,
    FeatursComponent,
    AdvertisementComponent,
    RecentProductComponent,
    NewsletterComponent,
    FeaturedProductComponent,
    FeedbackComponent,
    FooterComponent,
    ProductComponent,
    ProductPageComponent,
    BreadcrumbComponent,
    ProductListComponent,
    SidebarComponent,
    EmployeeHomeComponent,
    EmployeeComponent,
    EmployeeNavbarComponent,
    EmployeeHeaderComponent,
    AgreementFormComponent,
    AdminComponent,
    AdminLoginComponent,
    DialogComponent,
    CustomerComponent,
    DialogLoginComponent,
    ContactUsComponent,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CarouselModule,
    CarouselsModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatSidenavModule,
    MatListModule,
    MatMenuModule,
    MatToolbarModule,
    MatFormFieldModule,
    MatInputModule,
    MatDialogModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
