import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { SearchbarComponent } from './searchbar/searchbar.component';
import { SearchComponent } from './search/search.component';
import { MainBodyComponent } from './main-body/main-body.component';
import { MainBannerComponent } from './main-banner/main-banner.component';
import {CarouselsModule} from "./carousel/carousels.module";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatIconModule} from "@angular/material/icon";
import { FeatursComponent } from './featurs/featurs.component';
import { AdvertisementComponent } from './advertisement/advertisement.component';
import { RecentProductComponent } from './recent-product/recent-product.component';
import { CarouselModule } from 'ngx-owl-carousel-o';
import { NewsletterComponent } from './newsletter/newsletter.component';
import { FeaturedProductComponent } from './featured-product/featured-product.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { FooterComponent } from './footer/footer.component';



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


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CarouselModule,
    CarouselsModule,
    BrowserAnimationsModule,
    MatIconModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
