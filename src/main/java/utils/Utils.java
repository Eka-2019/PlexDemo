package utils;

import java.util.Arrays;
import java.util.List;

public class Utils {

    public List<String> expectedProductSubMenuList() {
        List<String> expectedList = Arrays.asList("Manufacturing Execution System (MES)",
                "Enterprise Resource Planning (ERP)",
                "Quality Management System (QMS)",
                "Supply Chain Planning (SCP)",
                "Production Monitoring",
                "MES Automation & Orchestration",
                "Asset Performance Management (APM)");
        return expectedList;
    }

    public List<String> expectedPlatformSubMenuList() {
        List<String> expectedList = Arrays.asList("Smart Manufacturing Platform Overview",
                "Cloud Infrastructure & Security",
                "Mobile Application",
                "Availability & Performance",
                "Manufacturing Automation");
        return expectedList;
    }

    public List<String> expectedIndustriesSubMenuList() {
        List<String> expectedList = Arrays.asList("Automotive",
                "Food & Beverage",
                "Precision Metalforming",
                "Plastics & Rubber",
                "Industrial Manufacturing",
                "High Tech & Electronics",
                "Aerospace");
        return expectedList;
    }

    public List<String> expectedResourcesSubMenuList() {
        List<String> expectedList = Arrays.asList("All Resources",
                "Success Stories",
                "Analyst Reports",
                "Demos",
                "Blog");
        return expectedList;
    }

    public List<String> expectedMenuList() {
        List<String> expectedList = Arrays.asList("Products",
                "Platform",
                "Industries",
                "Resources");
        return expectedList;
    }


}
