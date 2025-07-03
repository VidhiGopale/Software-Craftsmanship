# Hotel Automation

## Analysis

1. A Hotel can have multiple floors
2. Each floor can have multiple main corridors and sub corridors
3. Both main corridor and sub corridor have one light each
4. Both main and sub corridor lights consume 5 units of power when ON 
5. Both main and sub corridor have independently controllable ACs 
6. Both main and sub corridor ACs consume 10 units of power when ON 
7. All the lights in all the main corridors need to be switched ON between 6PM to 6AM, which is the Night Time slot 
8. By default, all ACs are switched ON, all the time 
9. When a motion is detected in one of the sub corridors the corresponding lights need to be switched ON between 6PM to 6AM (Night Time slot)
10. The total power consumption of all the ACs and lights combined should not exceed(Number of Main corridors * 15) + (Number of sub corridors * 10) units of per floor. Sub corridor AC could be switched OFF to ensure that the power consumption is not more than the specified maximum value 
11. When there is no motion for more than a minute the sub corridor lights should be
switched OFF and AC needs to be switched ON

## Class

1. Hotel
   1. Attributes : floor(list),
   2. Behaviours : add_floor()

2. Floor
   1. Attributes : floor_number, main_corridor(list), sub_corridor(list), power_consumption, power_budget
   2. Behaviours : get_power_consumption, get_power_budget

3. Main_Corridor
   1. Attributes : corridor_id, light, ac, motion_sensor, power_consumption
   2. Behaviours : get_total_power

4. Sub_Corridor
   1. Attributes : sub_corridor_id, light, ac, motion_sensor, power_consumption
   2. Behaviours : get_total_power, detect_motion

5. Light
   1. Attributes : light_status(enum), power(int)
   2. Behaviours : switch_on, switch_off, consume_power

6. AC
   1. Attributes : ac_status(enum), power(int)
   2. Behaviours : switch_on, switch_off, consume_power

7. Motion_sensor
   1. Attributes : motion(enum)
   2. Behaviours : detect

## Enum

1. Light_Status - on, off
2. AC_Status - on, off
3. Motion - Yes, No

