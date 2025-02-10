


import { Component } from '@angular/core';
import {RouterLink, RouterLinkActive, RouterOutlet} from '@angular/router';

@Component({
  selector: 'app-navbar', // Ensure this matches the tag used in app.component.html
  templateUrl: './navbar-ui.component.html',
  imports: [
    RouterLink,
    RouterLinkActive,
    RouterOutlet
  ],
  styleUrls: ['./navbar-ui.component.css']
})
export class NavbarUiComponent {}

